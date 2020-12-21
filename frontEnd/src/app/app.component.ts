import { Component, OnInit, AfterViewInit, ViewChild, Input, SimpleChange, SimpleChanges } from '@angular/core';
import { timeout } from 'q';
import { Observable, of } from 'rxjs';
import { FormsModule, FormGroup, FormBuilder }   from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { DatePipe } from '@angular/common';
import { throwError } from 'rxjs';
import { catchError, retry, startWith, withLatestFrom, map, tap } from 'rxjs/operators';
import { UserService } from './app.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit, AfterViewInit{
  @Input("search")input: string;
 
  displayedColumns: string[] = ['id', 'username', 'password', 'isEnable', 'registerDate', 'name', 'surname', 'email', 'phone'];
  users:any[] = [];
  dataSource = this.users;
  hasUser = true;
  title = 'desafioFront';
  filterUsers$: Observable<any[]>;
  users$: Observable<any[]>;

  formGroup: FormGroup;
  constructor(private http: HttpClient,
              private appService: UserService,
              private datePipe: DatePipe,
              private formBuilder: FormBuilder) {
    //this.getUsers();
  }

  ngAfterViewInit(): void {
   
  }
  ngOnInit(): void {
    this.appService.getAllUsers().subscribe((usersResponse: any[]) => {
      this.users = usersResponse;
      this.dataSource = usersResponse;
    })
  }

  searchEvent(searchData){
      if(searchData == null || searchData == ''){
        this.dataSource = this.users;
      }
      this.dataSource = this.dataSource.filter(s => s.name.toLowerCase().includes(searchData.toLowerCase()) ||
                                               s.email.toLowerCase().includes(searchData.toLowerCase()) ||
                                               s.username.toLowerCase().includes(searchData.toLowerCase()));
  }

  fixDate(date){
    return this.datePipe.transform(date, "dd/MM/yyyy")
  }
}
