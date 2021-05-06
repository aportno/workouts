-- Find the number of elements of a list

myLength :: [a] -> Int
myLength list = myLength_acc list 0
    where
        myLength_acc [] n = n
        myLength_acc (_:xs) n = myLength_acc xs (n + 1)