import React from 'react';
import { inject, observer } from 'mobx-react';

/**
 * Header react component class
 * @extends {React.Component}
 */
@inject(['store'])
export default class Header extends React.Component{
  /** @type {String} Quizboard game title */
  title = this.props.store.title

  /** @type {Object} attributes for team 1 */
  team1 = this.props.store.teams[0]

  /** @type {Object} attributes for team 2 */
  team2 = this.props.store.teams[1]

  /**
   * Render Header component JSX markup
   * @return {Object} JSX markup object
   * @todo  move team score and name to computed string on mobx store logic
   */
  render() {
    return (
    	<header className="banner">
    		<div className="banner__primary">
    			{this.title}
    		</div>
    		<div className="banner__score banner__score--left">
    			{this.team1.name}: {this.team1.score}
    		</div>
    		<div className="banner__score banner__score--right">
    			{this.team2.name}: {this.team2.score}
    		</div>
    	</header>
    );
  }
}
