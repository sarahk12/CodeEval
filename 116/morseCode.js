/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/116/
*/

var fs = require("fs");
var morse = ["-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", 
    ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", 
    "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."];
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var arr = line.split(" ");
        var space = 0;
        for (var i = 0; i < arr.length; i++) {
            space++;
            for (var j = 0; j < morse.length; j++) {
                if (space === 2) {
                    process.stdout.write(" ");
                    space = 0;
                }
                if ((arr[i] === morse[j]) && j < 10) {
                    process.stdout.write(j.toString());
                    space = 0;
                }
                else if (arr[i] === morse[j]) {
                    process.stdout.write(String.fromCharCode(j + 55));
                    space = 0;
                }
            }
        }
        console.log();
    }
});