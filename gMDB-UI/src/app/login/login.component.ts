import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Credential } from '../credential';
import { LoginService } from './login.service';
import { User } from '../user';
import { Router } from '@angular/router';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginform: FormGroup;
  currentuser: User;
  constructor(private router: Router, private formbuilder: FormBuilder, private loginservice: LoginService) { }

  ngOnInit() {
    this.loginform = this.formbuilder.group({
      email: ['', Validators.email],
      password: ['']

    })
  }

  login() {
    const credential = new Credential();
    credential.email = this.loginform.value.email;
    credential.password = this.loginform.value.password;
    credential.isAdmin = false;

    this.loginservice.login(credential).subscribe(resp => {


      if (resp == null) {
        this.router.navigate(['/login']);
      } else {
        this.currentuser = resp;
        console.log("my response is ", resp);
    
        this.router.navigate(['/movies']);
      }
    });




<<<<<<< HEAD
      this.loginservice.login(credential);
      console.log(credential);
    

    
=======
  
>>>>>>> ce00181bcd1e540f04dfdffc3f0e5e22bf0b7db2


  }

}
