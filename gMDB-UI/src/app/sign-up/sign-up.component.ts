import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { User } from '../user';
import { SignupService } from './signup.service';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {
  signupform: FormGroup;
  constructor(private formbuilder: FormBuilder, private signupservice: SignupService) { }

  ngOnInit() {
    this.signupform = this.formbuilder.group({
      firstname:['', Validators.email],
      lastname:['', Validators.email],
      email:['', Validators.email],
      password:['']

    })
  }

  signup(){
    const user = new User();
    user.id = null;
    user.firstname = this.signupform.value.firstname;
    user.lastname = this.signupform.value.lastname;
    user.email = this.signupform.value.email;
    user.password = this.signupform.value.password;

    // console.log(user);

    this.signupservice.signup(user);
    
  }

}
