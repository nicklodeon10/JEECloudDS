import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app.component';
import { FormsModule } from "@angular/forms";
import { ProductComponent } from "./app.productcomponent";
import { HttpClientModule } from '@angular/common/http'
import { ShowComponent } from './app.showcomponent';
import { AboutUsComponent } from './app.aboutuscomponent';
import { Routes, RouterModule } from '@angular/router';

const myroutes:Routes= [
    {path: 'about', component: AboutUsComponent},
    {path: 'add', component: ProductComponent},
    {path: 'show', component: ShowComponent}
];

@NgModule({
    imports: [
        BrowserModule,
        FormsModule,
        HttpClientModule,
        RouterModule.forRoot(myroutes)
    ],
    declarations: [
        AppComponent,
        ProductComponent,
        ShowComponent,
        AboutUsComponent
		],
    providers: [ ],
    bootstrap: [AppComponent]
})

export class AppModule { }