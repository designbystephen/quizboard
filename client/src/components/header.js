import React from 'react';
import { inject, observer } from 'mobx-react';

/**
 * Header react component class
 * @extends {React.Component}
 */
@inject(['store'])
export default class Header extends React.Component{
  /**
   * Render Header component JSX markup
   * @return {Object} JSX markup object
   */
  render() {
    return (
    	<header className="banner">
    		<div className="banner__primary">
    			{this.props.store.title}
    		</div>
    		<div className="banner__score banner__score--left">
    			{this.props.store.teams[0].score}
    		</div>
    		<div className="banner__score banner__score--right">
    			{this.props.store.teams[1].score}
    		</div>
    	</header>
    );
  }
}
