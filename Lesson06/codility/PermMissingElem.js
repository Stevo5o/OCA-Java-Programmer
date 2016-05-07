var a = [1, 2, 3, 5];

function solution1(a) {
	var length = a.length;
	var sum = ((a.length + 1) / 2) * (a.length + 2);
	var sumMinusMissing = 0;
	for(var i = 0; i < a.length; i++) {
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
console.log("Missing number is " + solution1(a));
console.log("Missing number is " + solution2(a));
