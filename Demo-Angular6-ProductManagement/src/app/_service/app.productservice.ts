import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http'

@Injectable({
    providedIn: 'root'
})

export class ProductService{

    //Dependency Injection
    constructor(private myhttp:HttpClient){}

    getAllData(){
        return this.myhttp.get('assets/product.json');
    }

}