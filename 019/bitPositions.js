/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/19/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var arr = line.split(",");
        var num = parseInt(arr[0]);
        var loc1 = parseInt(arr[1]);
        var loc2 = parseInt(arr[2]);
        var binary = new Array();

        for (var i = 0; num > 2; i++) {
            binary[i] = num % 2;
            num = parseInt(num / 2);    
        }
        if (num === 1)
            binary[i++] = 1;
        else
            binary[i++] = 0;
        var bit1 = binary[loc1 - 1];
        var bit2 = binary[loc2 - 1];
        
        if (bit1 === bit2)
            console.log("true");
        else
            console.log("false");
    }
});