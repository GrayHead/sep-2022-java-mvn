let user = {
    name: 'vasya',
    greeting: function () {
        //.....
    },
}
let student = {
    group: 'mem06',

    greeting: function () {
        //.....
    },
}

let policeman = {
    weapon: {},

    greeting: function () {
        //.....
    },
}

function asd(obj) {
    obj.greeting();
}

asd(user);
asd(student);
asd(policeman);
