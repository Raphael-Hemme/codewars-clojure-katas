(comment
  ;; Transportation on Vacation
  ;; https://www.codewars.com/kata/568d0dd208ee69389d000016/train/clojure
  (defn calc-rental-car-cost [d]
    (- (* d 40) (cond
                  (< d 3) 0
                  (< d 7) 20
                  :else 50)))

  (calc-rental-car-cost 6)



  ;; Grasshopper - Messi goals function
  ;; https://www.codewars.com/kata/55f73be6e12baaa5900000d4/train/clojure
  (defn goals [la-liga-goals copa-del-rey-goals champions-league-goals]
    (+ la-liga-goals copa-del-rey-goals champions-league-goals))

  (goals 5 18 3)



  ;; Reduce but Grow
  ;; https://www.codewars.com/kata/57f780909f7e8e3183000078/train/clojure
  (defn reduce-multiply [xs]
    (reduce * xs))

  (reduce-multiply (vector 3 4 5))



  ;; Grasshopper - Summation
  ;; https://www.codewars.com/kata/55d24f55d7dd296eb9000030/train/clojure
  (defn summation [n]
    (apply + (range 1 (inc n))))

  (summation 42)


  
  ;; Expressions matter
  ;; https://www.codewars.com/kata/5ae62fcf252e66d44d00008e/train/clojure
  (defn expression-matter [a b c]
    (let [ab-m (* a b)
          bc-m (* b c)
          ab-a (+ a b)
          bc-a (+ b c)]
      ;; (println ab-m bc-m ab-a bc-a)
     (max 
      (* a b c)
      (+ a b c) 
      (* ab-a c)
      (* a bc-a) 
      (+ ab-m c) 
      (+ a bc-m))
      ))
  
  (expression-matter 5 1 3)


  
  :rcf)