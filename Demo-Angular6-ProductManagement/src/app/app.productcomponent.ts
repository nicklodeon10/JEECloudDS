import {Component} from '@angular/core';
import {ProductService} from './_service/app.productservice';

@Component({
    selector: 'prod',
    templateUrl: 'app.product.html'
})

export class ProductComponent  {
    
    model:any={};

    constructor(private service:ProductService){}       

    addProduct():any{
        this.service.addProduct(this.model).subscribe((data)=>console.log(data));
    }

}