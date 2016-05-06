// Node v4.4.3
var x = 10, y = 85, d = 30;
function solution1(x, y, d) {
    return Math.ceil((y - x) / d);
}
function solution2(x, y, d) {
    var distance = y - x; 
    if((distance % d) === 0) {
        return (distance) / d;
    }
    else {
        return Math.floor((distance) / d + 1);
    }
}
function solution3(x, y, d) {
    var distance = y - x; 
    if((distance % d) === 0) {
        return (distance) / d;
    }
    else {
        return parseInt((distance) / d + 1);
    }
}
function solution4(x, y, d) {
    if((y - x) % d === 0) {
        return (y - x) / d;
    }
    else {
        return Math.floor((y - x) / d + 1);
    }
}
    
console.log("Math.ceil: froggy jumps:" + solution1(x, y, d));
console.log("If else with Math.floor: froggy jumps:" + solution2(x, y, d));
console.log("If else with parseInt: froggy jumps:" + solution3(x, y, d));
console.log("If else with Math.floor w/out var distance: froggy jumps:" + solution4(x, y, d));

/*
Math.ceil: froggy jumps:3 - solution1 codility score 100%
If else with Math.floor: froggy jumps:3 - solution2 codility score 100%
If else with parseInt: froggy jumps:3 - solution3 codility score 100%
If else with (parseInt): froggy jumps:3 - solution4 codility score 100%
If else with Math.floor w/out var distance: froggy jumps:3 - solution4 codility score 100%
*/