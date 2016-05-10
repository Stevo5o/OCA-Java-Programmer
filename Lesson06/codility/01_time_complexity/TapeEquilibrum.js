// Short Problem Definition:
// Minimize the value |(A[0] + … + A[P-1]) – (A[P] + … + A[N-1])|.
// Node v4.4.3
var a = [3, 1, 2, 4, 3];

function solution(a) {
	var sumAfter = sumBefore = 0;
	var minDiff = Number.POSITIVE_INFINITY;
	
	a.forEach(function(value) {
		sumAfter += value;
	});
	
	for(var i = 1; i < a.length; i++) {
		sumBefore += a[i - 1];
		sumAfter = sumAfter - a[i -1];
		minDiffTemp = Math.abs(sumBefore - sumAfter);
		if(minDiffTemp < minDiff) {
			minDiff = minDiffTemp;
		}
	}
	return minDiff;
}
console.log("Minimal difference: " + solution(a));
// Minimal difference: 1 - codility 100%