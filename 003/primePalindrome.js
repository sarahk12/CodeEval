/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/3/
*/

var num = main();
console.log(num);

function main() {
    for (var i = 999; i > 1; i--) {
        if (i % 2 === 0) {
            continue;
        }
        for (var j = 3; j <= i; j += 2) {
            if (i % j === 0 && i !== j) {
                break;
            }
            else if (j === i) {
                var first = i.toString();
                var second = reverse(first);
                if ((first == second) === true) {
                    return second;
                }
            }
        }
    }
}

function reverse(s) {
    var o = '';
    for (var i = s.length - 1; i >= 0; i--)
        o += s[i];
    return o;
}