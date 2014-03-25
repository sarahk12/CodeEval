/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/113/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var arr = line.split(" ");
        var nums = new Array();
        for (var i = 0; i < Math.floor(arr.length / 2) ; i++) {
            nums[i] = parseInt(arr[i]);
        }
        var k = 0;
        for (var j = (i + 1) ; j < arr.length; j++) {
            var num = parseInt(arr[j]);
            var ans = parseInt(parseInt(arr[k]) * parseInt(num));
            process.stdout.write(ans.toString());
            if (j != (arr.length - 1))
                process.stdout.write(" ");
            k++;
        }
        console.log();
    }
});