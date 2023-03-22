(ns alunos)

(defn quantidade-aluno-quinto-ano
  [aluno]
  (filter #( = 5% ) aluno)
  )
(quantidade-aluno-quinto-ano [5 3 2 3])

