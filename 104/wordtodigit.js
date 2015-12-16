/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/104/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var arr = line.split(';');
		var x;
		var digits = [""];
		for (x in arr) {
			switch(arr[x]) {
				case "zero":
					digits[x] = "0";
					break;
				case "one":
					digits[x] = "1";
					break;
				case "two":
					digits[x] = "2";
					break;
				case "three":
					digits[x] = "3";
					break;
				case "four":
					digits[x] = "4";
					break;
				case "five":
					digits[x] = "5";
					break;
				case "six":
					digits[x] = "6";
					break;
				case "seven":
					digits[x] = "7";
					break;
				case "eight":
					digits[x] = "8";
					break;
				case "nine":
					digits[x] = "9";
					break;
			}
		}
		for (x in digits) {
			process.stdout.write(digits[x]);
		}
		console.log();
    }
});
