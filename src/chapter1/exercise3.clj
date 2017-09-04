(ns chapter1.exercise3)

;; Write a function, `dec-maker`, returns functions that deduct the specified amount

(defn dec-maker
  "Make a decrementer fun"
  [x]
  #(- % x))

(def dec9 (dec-maker 9))

(println (= (dec9 10) 1))
