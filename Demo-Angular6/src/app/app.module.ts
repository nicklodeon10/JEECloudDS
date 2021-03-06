﻿import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app.component';
import {ProductComponent} from './app.productcomponent'
import {ShowProduct} from './app.showproductcomponent'
import {FormsModule} from '@angular/forms'

@NgModule({
    imports: [
        BrowserModule,
        FormsModule       
    ],
    declarations: [
        AppComponent, 
        ProductComponent,
        ShowProduct
		],
    providers: [ ],
    bootstrap: [AppComponent]
})

export class AppModule { }
