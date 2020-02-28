(ns eastwood-example.core
  (:import (com.google.api.core ApiFutures ApiFutureCallback ApiFuture)))


(defn foobar [^ApiFuture future]
  (ApiFutures/addCallback
    future
    (reify ApiFutureCallback
      (onFailure [_ throwable] (println throwable))
      (onSuccess [_ v] (println v)))))
