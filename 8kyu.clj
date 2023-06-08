(comment
  ;; Transportation on Vacation
  ;; https://www.codewars.com/kata/568d0dd208ee69389d000016/train/clojure
  (defn calc-rental-car-cost [d]
    (- (* d 40) (cond
                  (< d 3) 0
                  (< d 7) 20
                  :else 50)))

  (calc-rental-car-cost 6)
  
  :rcf)

(comment 
  ;; Grasshopper - Messi goals function
  ;; https://www.codewars.com/kata/55f73be6e12baaa5900000d4/train/clojure
  (defn goals [la-liga-goals copa-del-rey-goals champions-league-goals]
    (+ la-liga-goals copa-del-rey-goals champions-league-goals))
  
  (goals 5 18 3)
  
  :rcf)
  

(comment 
  ;; Reduce but Grow
  ;; https://www.codewars.com/kata/57f780909f7e8e3183000078/train/clojure
  (defn reduce-multiply [xs]
    (reduce * xs))
  
  (reduce-multiply (vector 3 4 5))
  
  :rcf)
  

(comment 
  ;; Grasshopper - Summation
  ;; https://www.codewars.com/kata/55d24f55d7dd296eb9000030/train/clojure
  (defn summation [n]
    (apply + (range 1 (inc n))))
  
  (summation 42)

  :rcf)