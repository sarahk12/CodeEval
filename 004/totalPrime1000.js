/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/4/
*/

var total = 5;
var counter = 3;
for (var i = 4; counter < 1001; i++) {
    if (i % 2 === 0)
        continue;
    for (var j = 3; j <= i; j+=2) {
        if (i % j === 0 && i !== j)
            break;
        if (j === i) {
            total = total + i;
            counter++;
        }
    }
}
console.log(total);