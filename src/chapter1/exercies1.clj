(ns chapter1.exercise1
  (:gen-class))

;;Use the str, vector, list, hash-map and hash-set functions.

(str "Hello" " " "world!")

(vector 1 2 3 4)
([1 2 3 4])

(list :a 2 4 "c")
`(:a 2 4 "c")

(hash-map :a 4 :d 1)
{:a 4 :d 1}

(hash-set 1 2 2 2 3 3 3 3 3 3 2 2 2)
#{1 2 2 2 3 3 3 3 3 3 2 2 2}
