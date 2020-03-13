const User = function (name) {
    this.name = name
};

User.prototype.welcomeUser = function () {
    return "Welcome " + this.name
};

var user = new User("Piotr");

console.log(user.welcomeUser())