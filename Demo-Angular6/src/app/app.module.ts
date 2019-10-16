﻿import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app.component';
import {ProductComponent} from './app.productcomponent'
import {ShowProduct} from './app.showproductcomponent'

@NgModule({
    imports: [
        BrowserModule
        
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
