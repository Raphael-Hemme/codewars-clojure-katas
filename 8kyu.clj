;; Transportation on Vacation
;; https://www.codewars.com/kata/568d0dd208ee69389d000016/train/clojure
(defn calc-rental-car-cost [d]
  (- (* d 40) (cond
                (< d 3) 0
                (< d 7) 20
                (>= d 7) 50)))

;; Grasshopper - Messi goals function
;; https://www.codewars.com/kata/55f73be6e12baaa5900000d4/train/clojure
(defn goals [la-liga-goals copa-del-rey-goals champions-league-goals]
  (+ la-liga-goals copa-del-rey-goals champions-league-goals))