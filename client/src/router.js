import "../styles/app.scss"
import React from "react"
import ReactDOM from "react-dom"
import { Router, Route, browserHistory } from 'react-router'
import { Provider } from 'mobx-react'


import Index from "./routes/index";
import Layout from "./components/layout";

const app = document.getElementById('root');

ReactDOM.render(
  <Provider>
    <Router history={browserHistory} component={Layout}>
      <Route path="/" component={Index}/>
    </Router>
   </Provider>,
  app
)
