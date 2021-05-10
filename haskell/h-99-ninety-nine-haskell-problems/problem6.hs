-- Find out whether a list is a palindrome. A palindrome can be read forward or backward

isPalindrome :: (Eq a) => [a] -> Bool
isPalindrome xs = xs == reverse xs

