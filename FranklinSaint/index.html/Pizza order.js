console.log("Welcome to Papa's Pizza!");
const prompt=require('prompt-sync')();
const pizzaSize=prompt("What size pizza do you want? Small ,Medium or Large ");
const pizzaTopping=prompt("Do you want pepperoni? Yes or No ");
const extraCheese=prompt("Do you want extra cheese? Yes or No ");
let pizza=pizzaSize.trim().toLowerCase();
let topping=pizzaTopping.trim().toLowerCase();
let cheese=extraCheese.trim().toLowerCase();
if(pizza=="small"){
    if (topping=="yes" && cheese=="yes"){
        console.log("Your bill is $18");
    }else if(topping=="yes" && cheese=="no"){
        console.log("Your bill is $17");
    }else(console,log("Your bill is $15"));
}else if(pizza=="medium"){
    if (topping=="yes" && cheese=="yes"){
        console.log("Your bill is $24");
    }else if(topping=="yes" && cheese=="no"){
        console.log("Your bill is $23");
    }else(console,log("Your bill is $20"));
}else if(pizza=="large"){
    if (topping=="yes" && cheese=="yes"){
        console.log("Your bill is $29");
    }else if(topping=="yes" && cheese=="no"){
        console.log("Your bill is $28");
    }else(console,log("Your bill is $25"));
}
