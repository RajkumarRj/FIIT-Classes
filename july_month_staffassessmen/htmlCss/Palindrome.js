
let input ="madam";

let i=0;
let j=input.length-1;
let isPalindrome = true;

while(i<j){
    if(input[i] !== input[j]){
       isPalindrome = false;
       break;
    }
    i++;
    j--;
}
if(isPalindrome){
    console.log("Palindrome");
    
}else{
    console.log("Not palindrome");
}


