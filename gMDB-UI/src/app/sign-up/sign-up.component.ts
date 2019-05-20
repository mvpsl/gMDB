import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { User } from '../user';
import { SignupService } from './signup.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {
  signupform: FormGroup;
  currentuser: User;

  // @Output() public myOutput = new EventEmitter();
  constructor(private router: Router, private formbuilder: FormBuilder, private signupservice: SignupService) { }

  ngOnInit() {
    this.signupform = this.formbuilder.group({
      firstname: ['', Validators.email],
      lastname: ['', Validators.email],
      email: ['', Validators.email],
      password: ['']

    })
  }

  signup() {
    const user = new User();
    user.id = null;
    user.firstname = this.signupform.value.firstname;
    user.lastname = this.signupform.value.lastname;
    user.email = this.signupform.value.email;
    user.password = this.signupform.value.password;

    // console.log(user);

    this.signupservice.signup(user).subscribe(resp => {
      if (resp == null) {
        this.router.navigate(['/signup']);
      } else {
        this.currentuser = resp;
        // this.myOutput.emit(resp);
        console.log("my response is ", resp);
        this.router.navigate(['/movies']);
      }
    });

  }

}
