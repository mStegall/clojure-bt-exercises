(ns chapter1.exercise2)

;; Write a function that takes a number and adds 100 to it

(defn add100
  [x]
  (+ x 100))

(println (= (add100 1) 101))
