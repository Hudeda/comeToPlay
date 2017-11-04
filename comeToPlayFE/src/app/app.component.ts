import { Component } from '@angular/core';
declare var $: any;


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  signUpFlag:boolean = false;

  selectedDepartment:any ;

  department:any[] = [
    {label:'Select Department', value: null},
    {label:'Kids', value:{id:1, name: 'Kids', code: 'K'}},
    {label:'Youth', value:{id:2, name: 'Youth', code: 'Y'}},
    {label:'Adult', value:{id:3, name: 'Adult', code: 'A'}}
  ];

  signUpClick(){
    this.signUpFlag = true;
  }

  signUpCancel(){
    $('#formSignUp').find('input').val('');
    this.selectedDepartment = null;
    this.signUpFlag = false;
  }

  signUpSave(){
    this.signUpCancel();
  }

}

interface City {
  name: string,
  code: string
}
