import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Credential } from '../credential';
import { LoginService } from './login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  
  loginform: FormGroup;
  constructor(private formbuilder: FormBuilder, private loginservice: LoginService) { }

  ngOnInit() {
    this.loginform = this.formbuilder.group({
      email:['', Validators.email],
      password:['']

    })
  }

  login(){
      const credential = new Credential();
      credential.email = this.loginform.value.email;
      credential.password = this.loginform.value.password;
      credential.isAdmin = false;

    this.loginservice.login(credential);
    console.log(credential);
    
  }

}
