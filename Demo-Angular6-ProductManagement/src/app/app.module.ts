import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app.component';
import {FormsModule} from "@angular/forms"
import { ProductComponent } from "./app.productcomponent"


@NgModule({
    imports: [
        BrowserModule,
        FormsModule
    ],
    declarations: [
        AppComponent,
        ProductComponent
		],
    providers: [ ],
    bootstrap: [AppComponent]
})

export class AppModule { }