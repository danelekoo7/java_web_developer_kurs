var Robot = function (name) {
    this.name = name;
    this.isFunctional = true;
}

Robot.prototype.sayHi = function (toWho) {
    if (!this.isFunctional) {
        console.log("Robot " + this.name + " is broken");
        return;
    }
    console.log("Robot " + this.name + " greets " + toWho);
};

Robot.prototype.changeName = function (newname) {
    console.log("Robot " + this.name + "changes name to " + newname);
    this.name = newname;
};

Robot.prototype.fixIt = function () {
    this.isFunctional = true;
    console.log("Robot " + this.name + "was fixed");
};

Robot.prototype.breakIt = function () {
    this.isFunctional = false;
    console.log(`Robot ${this.name} was broken`)
}

const rumba = new Robot("Rumba")
rumba.sayHi("KAT_JEE_W_04")
rumba.changeName("RUMBA")
rumba.sayHi("KAT_JEE_W_04")
rumba.breakIt()
rumba.sayHi("KAT_JEE_W_04")
rumba.fixIt()
rumba.sayHi("KAT_JEE_W_04")

