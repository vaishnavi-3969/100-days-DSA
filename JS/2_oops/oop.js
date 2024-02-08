function Checking(){
    this.balance = 0; // property
    this.deposit = deposit; // function
    this.withdraw = withdraw; // function
    this.toString = toString; // function
}

function deposit(amount){
    this.balance += amount;
}

function withdraw(amount){
    if(amount <= this.balance){
        this.balance -= amount;
    }
    if(amount > this.balance){
        console.log("Insufficient funds");
    }
}

function toString() {
    return "Balance: " + this.balance;
}


var account = new Checking(100);
account.deposit(1000);
console.log(account.toString()); // Balance: 1100
account.withdraw(750);
console.log(account.toString()); // Balance: 350
account.withdraw(800); // displays "Insufficient funds"
console.log(account.toString()); // Balance: 350





