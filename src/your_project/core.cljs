(ns your-project.core)

(set! *warn-on-infer* true)

(defprotocol IReactiveAtom)

(deftype Ratom [bar]
  ; IAtom
  IReactiveAtom
  )
