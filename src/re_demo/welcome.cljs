(ns re-demo.welcome
  (:require [re-com.core    :refer [title label]]
            [re-com.buttons :refer [hyperlink-href]]
            [re-com.box     :refer [h-box v-box box gap line]]
            [re-demo.utils  :refer [panel-title component-title]]))



(defn panel2
  []
  [v-box
   :size     "auto"
   :children [[panel-title "Welcome"]
              [gap :size "15px"]
              [:p
               "Re-com is a library of ClojureScript UI components, built on top of "
               [hyperlink-href
                :label  "Reagent"
                :href   "https://github.com/reagent-project/reagent"
                :target "_blank"]
               "."]
              [:p "It contains some of layout and widgetry needed to build a desktop-class app."]]])


(defn panel
  []
  [panel2])
