import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app.component';
import {AddEmployee} from './app.addemployeecomponent';
import {ShowEmployee} from './app.showemployeecomponent'
import {SearchEmployee} from './app.searchemployeecomponent'



@NgModule({
    imports: [
        BrowserModule
        
    ],
    declarations: [
        AppComponent,
        AddEmployee,
        ShowEmployee,
        SearchEmployee
		],
    providers: [ ],
    bootstrap: [AppComponent]
})

export class AppModule { }