public class id_generation {
    String costumerame;
    String product;
    String category;
    int order_number;
    int m;
    String longer_string;
    String shorter_string;
    id_generation(String category,String costumername,String product,int order_number,int m ){
        this.costumerame=costumername;
        this.product=product;
        this.category=category;
        this.order_number=order_number;
        this.m=m;
    }
    public String id_generator(){
        String longer_string;
    String shorter_string;
        if(costumerame.length()>product.length()){
            longer_string=costumerame;
            shorter_string=product;
        }
        else if(costumerame.length()<product.length()){
            longer_string=product;
            shorter_string=costumerame;
        }
        else{
            if(costumerame.compareTo(product)>=0){
                longer_string=costumerame;
            shorter_string=product;
            }
            else{
                longer_string=product;
            shorter_string=costumerame;
            }
        }
        String final_string="";
        final_string+=shorter_string.charAt(shorter_string.length()-1);
        final_string+=category;
        final_string+=longer_string.charAt(0);
        String random_num=String.valueOf(order_number);
        final_string+=random_num.substring(m, m+2);
    
return final_string;
        }
        }
        
