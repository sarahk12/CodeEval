/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/122/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var myBoolean = false;
        for (var i = 0; i < line.length; i++) {
            if (line.charAt(i) === 'a') {
                process.stdout.write('0');
                myBoolean = true;
            }
            else if (line.charAt(i) === 'b') {
                process.stdout.write('1');
                myBoolean = true;
            }
            else if (line.charAt(i) === 'c') {
                process.stdout.write('2');
                myBoolean = true;
            }
            else if (line.charAt(i) === 'd') {
                process.stdout.write('3');
                myBoolean = true;
            }
            else if (line.charAt(i) === 'e') {
                process.stdout.write('4');
                myBoolean = true;
            }
            else if (line.charAt(i) === 'f') {
                process.stdout.write('5');
                myBoolean = true;
            }
            else if (line.charAt(i) === 'g') {
                process.stdout.write('6');
                myBoolean = true;
            }
            else if (line.charAt(i) === 'h') {
                process.stdout.write('7');
                myBoolean = true;
            }
            else if (line.charAt(i) === 'i') {
                process.stdout.write('8');
                myBoolean = true;
            }
            else if (line.charAt(i) === 'j') {
                process.stdout.write('9');
                myBoolean = true;
            }
            else if (line.charAt(i) === '0' || line.charAt(i) === '1' || line.charAt(i) === '2' || line.charAt(i) === '3' || 
                    line.charAt(i) === '4' || line.charAt(i) === '5' || line.charAt(i) === '6' || line.charAt(i) === '7' || 
                    line.charAt(i) === '8' || line.charAt(i) === '9') {
                process.stdout.write(line.charAt(i));
                myBoolean = true;
            }
            else if (myBoolean === false && i === (line.length - 1))
                process.stdout.write("NONE");
        }
        console.log();
    }
});