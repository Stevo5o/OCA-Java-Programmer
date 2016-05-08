// Node v4.4.3
var a = [1, 2, 3, 5];

function solution1(a) {
	var length = a.length;
	var sum = ((length + 1) / 2) * (a.length + 2);
	var sumMinusMissing = 0;
	for(var i = 0; i < length; i++) {
		sumMinusMissing += a[i];
	}	
	return sum - sumMinusMissing;
}
function solution2(a) {
	var sum = ((a.length + 1) / 2) * (a.length + 2);
	var sumMinusMissing = 0;	
	a.forEach(function(element) {
		sumMinusMissing += element;
	}, this);
	
	return sum - sumMinusMissing;
}
console.log("Using for loop. The Missing number is " + solution1(a));
console.log("Using forEach. Missing number is " + solution2(a));

// Using for loop. The Missing number is 4
// Using forEach. Missing number is 4