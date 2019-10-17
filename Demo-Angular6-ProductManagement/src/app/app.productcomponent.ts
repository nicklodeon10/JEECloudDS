import {Component, OnInit} from '@angular/core';
import {ProductService} from './_service/app.productservice';

@Component({
    selector: 'prod',
    templateUrl: 'app.product.html'
})

export class ProductComponent implements OnInit{
    
    /*prodId:number;
    prodName:string;
    prodPrice:number;*/
    products:any[]=[];  
    currIndex:any;
    flag:boolean=false;

    constructor(private service:ProductService){
        console.log("Inside the constructor.");
    }

    ngOnInit(){
        this.service.getAllData().subscribe(data=>console.log(data));
    }

    // addProduct():any{
    //     this.products.push({prodId: this.prodId, prodName: this.prodName, prodPrice: this.prodPrice});
    // }

    // searchProduct(index: any):any{
    //     this.currIndex=index;
    //     this.flag=true;
    // }

    // updateProduct(){
    //     this.flag=false;
    // }

    // deleteProduct(index: any):any{
    //     this.products.splice(index,1); 
    // }
}