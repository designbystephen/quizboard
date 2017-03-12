import React from 'react'
import { inject, observer, computed } from 'mobx-react'

import Tile from './tile';

/**
 * Display a grouping of questions along with a category header for each provided category
 * @class Category React Component
 * @extends {React.Component}
 */
@inject(['store'])
export default class Category extends React.Component{
  /** @type {String} category title */
  title =  this.props.title

  /** @type {Array} collection of question tiles */
  tiles = this.props.tiles

  /**
   * Render Category JSX markup
   * @return {Object} JSX Markup
   */
  render() {
	return (
		<div className="category-list__group">
			<Tile value={this.title} classModifier="tile--header" />
			{this.tiles.map(tile=>(
				<Tile key={tile.id} value={tile.value} question={tile.question} answer={tile.answer} />
			))}
		</div>
	);
  }
}
