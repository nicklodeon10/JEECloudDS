import {Component, OnInit} from '@angular/core';
import {ProductService} from './_service/app.productservice';

@Component({
    selector: 'prod',
    templateUrl: 'app.product.html'
})

export class ProductComponent {
    
    prodId:number;
    prodName:string;
    prodPrice:number;
    products:any[]=[];  
    currProduct:any;
    currIndex:any;
    flag:boolean=false;

    // constructor(private service:ProductService){
    //     console.log("Inside the constructor.");
    // }

    // implements OnInit
    // ngOnInit(){
    //     this.service.getAllData().subscribe((data:Product[])=>this.products=data);
    // }

    addProduct():any{
        this.products.push({prodId: this.prodId, prodName: this.prodName, prodPrice: this.prodPrice});
    }

    searchProduct(product: any):any{
        this.currProduct={prodId: product.prodId, prodName: product.prodName, prodPrice: product.prodPrice};;
        this.flag=true;
    }

    updateProduct(){
        for(let i=0; i<this.products.length; i++){
            if(this.products[i].prodId==this.currProduct.prodId){
                this.products[i]=this.currProduct;
                break;
            }
        }
        this.flag=false;
    }

    deleteProduct(index: any):any{
        this.products.splice(index,1); 
    }
}