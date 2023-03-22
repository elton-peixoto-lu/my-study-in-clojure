(ns quadractic)
(defn quadratic-roots
  "Solve for the 2 roots of a quadratic equation of the form:

       ax^2 + bx + c = 0
  "
  [a b c]
  (let [discriminant (Math/sqrt (- (* b b) (* 4 a c)))
        neg-b        (- b)
        inv-a2       (/ 1 (* 2 a))
        root-1       (* inv-a2 (+ neg-b discriminant))
        root-2       (* inv-a2 (- neg-b discriminant))]
    [root-1 root-2]))

(let [a 1
      b 4
      c -21]

(quadratic-roots a b c))