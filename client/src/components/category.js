import React from 'react'
import { inject, observer } from 'mobx-react'

import Tile from './tile';

/**
 * Display a grouping of questions along with a category header for each provided category
 * @class Category React Component
 * @extends {React.Component}
 */
@inject(['store'])
export default class Category extends React.Component{
  
  /**
   * Render Category JSX markup
   * @return {Object} JSX Markup
   */
  render() {
	return (
		<div className="category">
			<Tile value="Category One" classModifier="tile--header" />
			<Tile value="100" />
		</div>
	);
  }
}
