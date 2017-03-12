import "./styles/app.scss";
import React from "react";
import ReactDOM from "react-dom";
import { Router, Route, IndexRoute, browserHistory } from 'react-router';
import { Provider } from 'mobx-react';


import Index from "./routes/index";
import Layout from "./components/layout";

const app = document.getElementById('root');

  // <Provider>
  //   <Router history={browserHistory}>
  //     <Route path="/" component={Layout}>
  //     	<IndexRoute component={Index} />
  //     </Route>
  //   </Router>
  //  </Provider>,

ReactDOM.render(
	<Provider>
		<Layout>
	  		<Index />
	  	</Layout>
	</Provider>,
	app
)
