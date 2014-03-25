/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/29/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var arr = line.split(","); // Splits the string by space
        var nums = [];
        for (var i = 0; i < arr.length; i++) {
            var n = parseInt(arr[i]);
            nums[n] = true;
        }
        i = 0;
        while (nums[i] !== true) {
            i++;
        }
        process.stdout.write(i.toString());
        i++;
        for (i = i; i < nums.length; i++) {
            if (nums[i] === true)
                process.stdout.write( "," + (i).toString());
        }
        console.log();
    }
});