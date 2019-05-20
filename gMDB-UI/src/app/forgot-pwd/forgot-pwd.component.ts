import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { User } from '../user';


@Component({
  selector: 'forgot-pwd',
  templateUrl: './forgot-pwd.component.html',
  styleUrls: ['./forgot-pwd.component.css']
})
export class ForgotPwdComponent implements OnInit {
  recoverform: FormGroup;
  constructor(private formbuilder: FormBuilder) { }

  ngOnInit() {
    this.recoverform = this.formbuilder.group({
      email:['', Validators.email],
      password:['']
    })
  }
  recover(){
    const user = new User();
    user.id = null;
    user.email = this.recoverform.value.email;
    user.password = this.recoverform.value.password;
    console.log(user);
    
  }

}


